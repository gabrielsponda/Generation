import './App.css'
import Footer from './components/footer/Footer'
import Navbar from './components/navbar/Navbar'
import Home from './pages/home/Home'

function App() {

  return (
    <>
      <Navbar />
      <div className="min-h-[80vh] mt-16" >
        <Home />
      </div>
      <Footer />
    </>
  )
}

export default App
