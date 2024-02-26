import React from "react";
import { createContext,useContext } from "react";

export const ThemeContex=createContext({
    themeMode:"light",
    darkMode:()=>{},
    lightMode:()=>{}
});

export const ThemeProvider=ThemeContex.Provider;

export const useTheme=()=>{
    return useContext(ThemeContex)
}

