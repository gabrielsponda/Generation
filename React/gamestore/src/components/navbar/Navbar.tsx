import { GameController } from "phosphor-react"
import { Link } from "react-router-dom"

function Navbar() {

    return (
        <>
            <div className='fixed top-0 w-full bg-black text-white flex justify-center py-4 border-b border-white'>
                <div className="container flex justify-between text-lg items-center">
                    <Link to="/home" className='flex items-center text-4xl font-bold uppercase gap-2'><GameController size={48} />Game Store</Link>
                    <div className='flex gap-10'>
                        <div className='hover:underline'>Produtos</div>
                        <Link to="/categorias" className='hover:underline'>Categorias</Link>
                        <Link to="/cadastroCategoria" className='hover:underline'>Cadastrar categoria</Link>
                        <div className='hover:underline'>Sair</div>
                    </div>
                </div>
            </div >
        </>
    )
}

export default Navbar