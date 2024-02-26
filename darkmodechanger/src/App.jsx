import { useEffect, useState } from 'react'

import ToggleBtn from './components/ToggleBtn.jsx'
import { ContextProviders } from './context/themeContext.js';


function App() {
  const[themeMode,setThemeColor]=useState("light");
  const darkMode=()=>{
    setThemeColor("dark");
  }
  const ligthMode=()=>{
    setThemeColor("light");
  }
  useEffect(()=>{
    document.body.style.backgroundColor=themeMode;

  },[themeMode])


  

  return (
    <ContextProviders value={{themeMode,darkMode,ligthMode}}>
        <ToggleBtn/>
    </ContextProviders>
    
   
    
  )
}

export default App
