import React,{useState,useContext} from "react";
import UserContext from "../context/UserContext";
import './Login.css';


function Login(){
    const [username,setUsername]=useState('');
    const[password,setPassword]=useState('');

    const{setUser}=useContext(UserContext);
    const handleSubmit=(e)=>{
        e.preventDefault()
        setUser(username,password);
        

    }
    return(
        <>
        <div className="container">
            <h1>Login</h1>
            <input type="text"
                 placeholder="username"
                 value={username}
                 onChange={(e)=>setUsername(e.target.value)}
            />
            <input type="passwprd"
                value={password}
                onChange={(e)=>setPassword(e.target.value)}
                 placeholder="password"
            />
            <button
            onClick={handleSubmit}
            >submit</button>
        </div>

        
        </>
    )
}
export default Login;