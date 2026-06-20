import { useState } from 'react'
import './Input.css'
export default function Input(props) {
    const emailValid = (email) => {
        if (email.includes('@') && email.includes('.')) {
            props.setEmailValid(true)
        } else {
            props.setEmailValid(false)
        }
    }
    const passValid = (pass) => {
        if (pass.length >= 6) {
            props.setPassValid(true)
        } else {
            props.setPassValid(false)
        }
    }
    return (
        <>
        {/* {props.pass ? 'sim' : 'não'} */}
        <label>{props.label}</label>
        <input placeholder={props.placeholder} type={props.type} onInput={props.type === 'email' ? (e) => emailValid(e.target.value) : (e) => passValid(e.target.value)} />
        </>
    )
}