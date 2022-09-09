import { useState } from 'react'
import reactLogo from './assets/react.svg'
import './App.css'
import NotificationButton from './components/NotificationButton'
import Header from './components/Header/Index'
import SalesCard from './components/SalesCard/Index'

function App() {
  return(
    <>
      <Header />
      <main>
      <section id="sales">
        <div className="dsmeta-container">
          <SalesCard/>
          </div>
          </section>
          </main>
    </>
  )
}

export default App
