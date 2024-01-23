import { LinkedinLogo, GithubLogo } from '@phosphor-icons/react'

function Footer() {

    return (
        <div className="flex justify-center bg-black text-white">
            <div className="container flex flex-col items-center py-1">
                <p className="text-2xl font-bold mb-2">Gabriel Sponda</p>
                <div className="flex gap-4">
                    <a href="https://www.linkedin.com/in/gabrielsponda/" target="_blank" rel="noreferrer">
                        <LinkedinLogo size={36} weight="bold" className="hover:text-indigo-300" />
                    </a>
                    <a href="https://github.com/gabrielsponda/" target="_blank" rel="noreferrer">
                        <GithubLogo size={36} weight="bold" className="hover:text-indigo-300" />
                    </a>
                </div>
            </div>
        </div>
    )
}

export default Footer