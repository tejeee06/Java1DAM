import React, { useState } from 'react';
import arrow from '../Imatges/arrow.png'
import './DropDown.css';

function DropDown({ selectedOption, onOptionChange }) {
  const options = ['Java', 'JavaScript', 'C#', 'Kotlin', 'Python'];
  const [isOpen, setIsOpen] = useState(false);

  const handleToggle = () => {
    setIsOpen(!isOpen);
  };

  // Actualitzem l'estat d'aquest component tambe a la classe pare gracies als Props.
  const handleSelect = (option) => {
    onOptionChange(option);
    setIsOpen(false);
  };

  return (
    <div className="dropdown">
      <div className="dropdown-label">
        <span>{selectedOption || 'Selecciona una opció'}</span>
        <button className="dropdown-toggle" onClick={handleToggle}>
          <img
            src={arrow}
            alt="Arrow"
            className={`arrow-icon ${isOpen ? 'rotated' : ''}`} // Per aplicar estils segons un condicional (ChatGPT)
          />
        </button>
      </div>
      {isOpen && ( // Nomes es renderitza el dropdown si l'usuari selecciona el boto per fer el desplegament
        <ul className="dropdown-menu">
          {options.map((option) => (
            <li
              key={option}
              className="dropdown-item"
              onClick={() => handleSelect(option)}
            >
              {option}
            </li>
          ))}
        </ul>
      )}
    </div>
  );
}

export default DropDown;