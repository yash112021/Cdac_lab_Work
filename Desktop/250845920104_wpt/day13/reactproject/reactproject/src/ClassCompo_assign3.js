// 3) write class Component 
//     with render method display 
// 	1 textField and 2 Buttons
// 			upper case , small case 
// 	when you click the button display output 
// 	in console in UPPERCASE / lowercase 
//     (use event handling )


import React, { Component } from "react";

class ComponentExample extends Component {
  constructor(props) {
    super(props);
    this.state = {
      text: ""
    };
  }

  handleInputChange = (event) => {
    this.setState({ text: event.target.value });
  };

  handleUpperCase = () => {
    const upperText = this.state.text.toUpperCase();
    this.setState({ text: upperText });
    console.log(upperText);
  };

  handleLowerCase = () => {
    const lowerText = this.state.text.toLowerCase();
    this.setState({ text: lowerText });
    console.log(lowerText);
  };

  render() {
    return (
      <div>
        <input
          type="text"
          value={this.state.text}
          onChange={this.handleInputChange}
          placeholder="Enter text"
        />
        <button onClick={this.handleUpperCase}>UPPER CASE</button>
        <button onClick={this.handleLowerCase}>lower case</button>
      </div>
    );
  }
}

export default ComponentExample;
