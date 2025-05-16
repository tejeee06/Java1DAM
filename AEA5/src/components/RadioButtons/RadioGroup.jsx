import React from 'react';
import Button from '../Buttons/Button';
import './RadioGroup.css';

function RadioGroup({ selectedOption, onOptionChange, displayMessage, setDisplayMessage }) { // Props, arguments de la classe pare (App.JSX)
  const options = ['Java', 'JavaScript', 'C#'];

  const handleValidate = () => {
    if (selectedOption) {
      setDisplayMessage(`Has seleccionat ${selectedOption}.`);
    } else {
      setDisplayMessage('Selecciona una opció.');
    }
  };

  const handleRefresh = () => {
    onOptionChange('');
    setDisplayMessage('');
  };

  return (
    <div className="radio-group">
      <h2>Llenguatges</h2>
      {options.map((option) => ( // Iterem sobre cada element del Array per crear una checkbox
        <label key={option} className="radio-option">
          <input
            type="checkbox"
            name="option"
            value={option}
            checked={selectedOption === option}
            onChange={(e) => {
              onOptionChange(e.target.checked && e.target.value !== selectedOption ? e.target.value : '');
            }}
          />
          <span className="custom-checkbox"></span>
          {option}
        </label>
      ))}
      <div className="radio-buttons">
        <Button text={'Validar'} onClick={handleValidate} />
        <Button text={'Refresh'} onClick={handleRefresh} />
      </div>
    </div>
  );
}

export default RadioGroup;


