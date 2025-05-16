import react from "react";
import './Button.css';

function Button({text, onClick}) {
    return (
        <button className="default-button" onClick={onClick}>
            {text}
        </button>
    );
}

export default Button;