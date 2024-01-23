
function Home() {

    return (
        <>
            <div id="container" className="flex justify-center bg-green-300 min-h-screen">
                <div id="subcontainer" className="container mx-4 md:grid md:grid-cols-2 text-black py-8">
                    <div id="texto" className="flex flex-col gap-4 items-center justify-center py-4">
                        <h2 className="text-5xl font-bold">Seja bem-vindo!</h2>
                        <p className="text-xl text-center">Na Game Store, cada clique é uma aventura!</p>
                        <div id="container-buttons" className="flex flex-col md:flex-row justify-around gap-4 w-full md:w-1/2 text-center">
                            <button className="rounded text-black border-black border-solid border-2 px-4 py-2 flex-1 hover:bg-black hover:text-white transition-colors">Encontrar Lojas</button>
                            <button className="rounded text-white border-black bg-black border-solid border-2 px-4 py-2 flex-1 hover:bg-white hover:text-black transition-colors">Ver Produtos</button>
                        </div>
                    </div>
                    <div id="imagem" className="flex justify-center mt-8 md:mt-0">
                        <img className="w-full md:w-2/3" src="src/assets/home.svg" alt="Imagem da Página Home" />
                    </div>
                </div>
            </div>
        </>
    );
}

export default Home;