import { useEffect, useRef, useState } from "react"

export default function Musica() {
    const [tocando, setTocando] = useState(false)
    const audio = useRef(null)
    const handleAudio = () => {
        if (tocando) {
            setTocando(!tocando)
            audio.current.pause()
        } else {
            setTocando(!tocando)
            audio.current.play()
        }
    }
    return (
        <section className="audioSection" onClick={() => handleAudio()}>
            <audio src="audio.mp3" ref={audio} loop></audio>
            {tocando ? <i className='bx bx-volume-full' ></i> : <i className='bx bx-volume-mute' ></i> }
        </section>
    )
}