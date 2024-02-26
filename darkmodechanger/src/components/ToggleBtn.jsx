import React from "react";
import { useTheme } from "../context/themeContext";

function ToggleBtn(){
    const {themeMode,darkMode, ligthMode}=useTheme()

    const onChangeTheme=(e)=>{
        const darkModeStatus=e.currentTarget.checked
        if(darkModeStatus){
            darkMode();
        }else{
            ligthMode();
        }

    }

    return(
        <>
        <div className="w-100 h-10 bg-green-500">
            <label className="text-red bg-green-500">Toggle Theme</label>
            <input type="checkbox"
            value=""
            onChange={onChangeTheme}
            checked={themeMode==="dark"}

            />
        </div>
        </>
    )
}
export default ToggleBtn;