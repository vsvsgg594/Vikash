import React, { useEffect, useState } from "react";
import './playvideo.css';
import video1 from '../../assets/video.mp4';
import share from '../../assets/share.png';
import save from '../../assets/save.png';
import jack from '../../assets/jack.png';
import profile_icon from '../../assets/user_profile.jpg';
import upload from '../../assets/upload.png';
import like from '../../assets/like.png';
import dislike from '../../assets/dislike.png';
import { API_KEY, value_convertor } from "../../data";
import moment from "moment";
import { useParams } from "react-router-dom";



function PlayVideo() {
    const {videoId}=useParams();
    const [apidata, setApiData] = useState(null);
    const [channelData, setChannelData] = useState(null);
    const [commentsData, setCommentsData] = useState([]);
    const fetchVideoData = async () => {
        const apiVideourl = `https://youtube.googleapis.com/youtube/v3/videos?part=snippet%2CcontentDetails%2Cstatistics&id=${videoId}&key=${API_KEY}`;
        await fetch(apiVideourl).then(response => response.json()).then(data => setApiData(data.items[0]))
    }
    const fetchChannelData = async () => {
        const channelDataUrl = ` https://youtube.googleapis.com/youtube/v3/channels?part=snippet%2CcontentDetails%2Cstatistics&id=${apidata.snippet.channelId}&key=${API_KEY}`;
        await fetch(channelDataUrl).then(response => response.json()).then(data => setChannelData(data.items[0]))

        const channelUrl = `https://youtube.googleapis.com/youtube/v3/commentThreads?part=snippet%2Creplies&videoId=${videoId}&key=${API_KEY}`;
        await fetch(channelUrl).then(response => response.json()).then(data => setCommentsData(data.items))
    }

    useEffect(() => {
        fetchVideoData();
    }, [videoId])
    useEffect(() => {
        fetchChannelData()
    }, [apidata])
    return (
        <div className="play-video">
            <iframe src={`https://www.youtube.com/embed/${videoId}?autoplay=1`}
                frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share"
                allowfullscreen></iframe>
            <h3>{apidata ? apidata.snippet.title : "title here"}</h3>
            <div className="play-video-info">
                <p>{apidata ? value_convertor(apidata.statistics.viewCount) : "0k"} likes &bull; {apidata ? moment(apidata.snippet.publishedAt).fromNow() : "0h"}</p>
                <div>
                    <span><img src={like} alt="likes" />{apidata ? value_convertor(apidata.statistics.likeCount) : "0"}</span>
                    <span><img src={dislike} alt="dislikes" />1k</span>
                    <span><img src={share} alt="liksharees" />share</span>
                    <span><img src={save} alt="likes" />save</span>
                </div>
            </div>
            <hr />
            <div className="publisher">
                <img src={channelData ? channelData.snippet.thumbnails.default.url : ""} alt="jack" />
                <div>

                    <p>{apidata ? apidata.snippet.channelTitle : "No Channel name "}</p>
                    <span>{channelData ? value_convertor(channelData.statistics.subscriberCount) : 0} Suscribers</span>
                </div>
                <button>Suscribe</button>
            </div>
            <div className="vid-descrition">
                <p>{apidata ? apidata.snippet.description : "description"}</p>
                <p>Suscribe for more videos</p>
                <hr />
                <h4>{apidata ? value_convertor(apidata.statistics.commentCount) : "0"} comments</h4>
                {commentsData.map((item, index) => {
                    return (

                        <div key={index} className="comment">
                            <img src={item.snippet.topLevelComment.snippet.authorProfileImageUrl} alt="user" />
                            <div>
                                <h3>{item.snippet.topLevelComment.snippet.authorDisplayName} <span>{moment(item.snippet.topLevelComment.snippet.publishedAt).fromNow()}</span> </h3>
                                <p>{item.snippet.topLevelComment.snippet.textOriginal}</p>
                                <div className="comment-action">
                                    <img src={like} alt="likes" />
                                    <span>{item.snippet.topLevelComment.snippet.likeCount}</span>
                                    <img src={dislike} alt="dislikes" />
                                </div>
                            </div>
                        </div>
                    )
                })}


            </div>

        </div>
    )
}
export default PlayVideo;