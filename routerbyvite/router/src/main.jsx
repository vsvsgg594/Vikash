import React from 'react'
import ReactDOM from 'react-dom/client'

import './index.css'
import {RouterProvider, createBrowserRouter } from 'react-router-dom'
import Home from './components/Home/Home.jsx'
import About from './components/About/About.jsx'
import Layout from './Layout.jsx'
import Contact from './components/Contact/Contact.jsx'


const router=createBrowserRouter([
  {
    path :"/",
    element :<Layout/>,
    children:[
      {
        path :"",
        element:<Home/>
      },
      {
        path:"about",
        element:<About/>
      },
      {
        path:"conatct",
        element:<Contact/>
      }
    ]

    }
])

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
   <RouterProvider router={router}
   />
  </React.StrictMode>,
)
