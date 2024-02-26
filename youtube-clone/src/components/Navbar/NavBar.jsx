import React from "react";
import './NavBar.css';
import menu_icon from '../../assets/menu.png';
import logo from '../../assets/logo.png';
import search_icon from '../../assets/search.png';
import upload_icon from '../../assets/upload.png';
import notification_icon from '../../assets/notification.png';
import profile_icon from '../../assets/jack.png';
import more_icon from '../../assets/more.png'
import { Link } from "react-router-dom";

function NavBar({setSidebar}) {
    return (
        <nav className="flex-div">
            <div className="nav-left flex-div">
                <img className="menu-icon" src={menu_icon} alt="menu-icon"
                onClick={()=>setSidebar(prev=>prev===false ? true: false)} />
                <Link to="/">
                <img className="logo" src={logo} alt="logo" />
                </Link>
            </div>
            <div className="nav-middle flex-div">
                <div className="search-box flex-div">
                    <input type="text" placeholder="Search" />
                    <img src={search_icon} alt="search-icon" />
                </div>
            </div>
            <div className="nav-right flex-div">
                <img src={upload_icon} alt="search icon" />

                <img src={notification_icon} alt="notifications" />
                <img src={more_icon} alt="profile-icon" />
                <img src={profile_icon} alt="profile" className="userIcon" />
            </div>

        </nav>
    )
}
export default NavBar;