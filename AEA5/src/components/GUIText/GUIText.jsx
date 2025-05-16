import React, { useState } from 'react';
import './GUIText.css';

function GUIText() {
  const [email, setEmail] = useState('');
  const [firstName, setFirstName] = useState('');

  return (
    <div className="guitext-container">
      <div className="guitext-field">
        <label htmlFor="email">Email</label>
        <input
          type="email"
          id="email"
          placeholder="Escriu el teu e-mail"
          value={email}
          onChange={(e) => setEmail(e.target.value)}
        />
      </div>
      <div className="guitext-field">
        <label htmlFor="firstName">First Name</label>
        <input
          type="text"
          id="firstName"
          placeholder="First Name please"
          value={firstName}
          onChange={(e) => setFirstName(e.target.value)}
        />
      </div>
    </div>
  );
}

export default GUIText;