import { GameController } from "phosphor-react"

function Navbar() {

    return (
        <>
            <div className='fixed top-0 w-full bg-black text-white flex justify-center py-4 border-b border-white'>
                <div className="container flex justify-between text-lg items-center">
                    <div className='flex items-center text-4xl font-bold uppercase gap-2'><GameController size={48} />Game Store</div>
                    <div className='flex gap-10'>
                        <div className='hover:underline'>Produtos</div>
                        <div className='hover:underline'>Categorias</div>
                        <div className='hover:underline'>Cadastrar categoria</div>
                        <div className='hover:underline'>Sair</div>
                    </div>
                </div>
            </div >
        </>
    )
}

export default Navbar