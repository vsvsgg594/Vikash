import React from "react";
import { useContext,createContext } from "react";

export const themeContext=createContext({
    themeMode:"",
    darkMode:()=>{},
    ligthMode:()=>{}
})
export const ContextProviders=themeContext.Provider;

export const useTheme=()=>{
    return useContext(themeContext);
}
