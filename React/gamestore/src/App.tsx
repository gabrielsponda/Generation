import { BrowserRouter, Route, Routes } from 'react-router-dom'
import './App.css'
import Footer from './components/footer/Footer'
import Navbar from './components/navbar/Navbar'
import Home from './pages/home/Home'
import FormCategoria from './components/categoria/formCategoria/FormCategoria'
import ListarCategorias from './components/categoria/listarCategorias/ListarCategorias'
import DeletarCategoria from './components/categoria/deletarCategoria/DeletarCategoria'

function App() {

  return (
    <>
      <BrowserRouter>
        <Navbar />
        <div className="min-h-screen" >
          <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/home" element={<Home />} />
            <Route path="/categorias" element={<ListarCategorias />} />
            <Route path="/cadastroCategoria" element={<FormCategoria />} />
            <Route path="/editarCategoria/:id" element={<FormCategoria />} />
            <Route path="/deletarCategoria/:id" element={<DeletarCategoria />} />
          </Routes>
        </div>
        <Footer />
      </BrowserRouter>
    </>
  )
}

export default App
