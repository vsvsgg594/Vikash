import React ,{useContext}from "react";
import UserContext from "../context/UserContext.js";

function Profile(){
    const{User}=useContext(UserContext);
    if(!User) return <h1>please login </h1>

    console.log(User.username);
    return <h2>welcome to {User.username}</h2>

    
}
export default Profile;