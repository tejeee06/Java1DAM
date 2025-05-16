import React, { useState } from 'react';
import Button from './components/Buttons/Button';
import RadioGroup from './components/RadioButtons/RadioGroup';
import DropDown from './components/DropDown/DropDown';
import GUIText from './components/GUIText/GUIText';
import './App.css';

function App() {
  const [selectedOption, setSelectedOption] = useState('');
  const [displayMessage, setDisplayMessage] = useState('');
  const [selectedDropOption, setSelectedDropOption] = useState('');
  const [dropMessage, setDropMessage] = useState('');

  const handleShowDrop = () => {
    if (selectedDropOption) {
      setDropMessage(`Has seleccionat ${selectedDropOption}.`);
    } else {
      setDropMessage('Selecciona una opció.');
    }
  };

  return (
    <div className="app-container">
      <div className="button-group">
        <Button text="Click" />
        <Button text="Click" />
      </div>
      <div className="radio-section">
        <RadioGroup
          selectedOption={selectedOption}
          onOptionChange={setSelectedOption}
          displayMessage={displayMessage} 
          setDisplayMessage={setDisplayMessage}
        />
        <span className="message">{displayMessage}</span>
      </div>
      <div className="dropdown-section">
        <DropDown
          selectedOption={selectedDropOption}
          onOptionChange={setSelectedDropOption}
        />
        <div className="dropdown-actions">
          <Button text="Show" onClick={handleShowDrop} />
          <span className="message">{dropMessage}</span>
        </div>
      </div>
      <div className='guitext-section'>
        <GUIText/>
      </div>
    </div>
  );
}

export default App;