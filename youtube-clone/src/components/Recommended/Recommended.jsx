import React, { useEffect, useState } from "react";
import './Recommended.css';
import thumbnail1 from '../../assets/thumbnail1.png';
import thumbnail2 from '../../assets/thumbnail2.png';
import thumbnail3 from '../../assets/thumbnail3.png';
import thumbnail4 from '../../assets/thumbnail4.png';
import thumbnail5 from '../../assets/thumbnail5.png';
import thumbnail6 from '../../assets/thumbnail6.png';
import thumbnail7 from '../../assets/thumbnail7.png';
import thumbnail8 from '../../assets/thumbnail8.png';
import { API_KEY, value_convertor } from "../../data";
import moment from "moment";
import { Link } from "react-router-dom";

function Recommended({ categoryId }) {

    const [recommendedData, setRecommendedData] = useState([]);
    const fetchRecommendedVideo = async () => {
        const recommendeUrl = `https://youtube.googleapis.com/youtube/v3/videos?part=snippet%2CcontentDetails%2Cstatistics&chart=mostPopular&maxResults=45&regionCode=US&videoCategoryId=${categoryId}&key=${API_KEY}`;
        await fetch(recommendeUrl).then(response => response.json()).then(data => setRecommendedData(data.items))
    }

    useEffect(() => {
        fetchRecommendedVideo();
    }, [])





    return (



        <div className="recommended">
            {recommendedData.map((item, index) => {
                return (
                    <Link  to={`/video/${item.snippet.categoryId}/${item.id}`} className="side-video-list">
                        <img src={item.snippet.thumbnails.default.url} alt="thumbnail" />
                        <div className="vid-info">
                            <h4>{item.snippet.title}</h4>
                            <p>{item.snippet.channelTitle}</p>
                            
                            <p>{value_convertor(item.statistics.viewCount)} &bull; {moment(item.snippet.publishedAt).fromNow()}</p>
                        </div>
                    </Link>

                )
            })}




        </div>
    )

}
export default Recommended;