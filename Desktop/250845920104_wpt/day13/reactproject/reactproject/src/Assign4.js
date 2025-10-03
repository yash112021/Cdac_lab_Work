// //  use predefined methods and check lifecycle of 
// // class Component  
// import {components} from "react";
//  export default class FromViewToCompClass extends components{
//     constructor(props){
//         super(props)
//         console.log("constructor");
//         this.state = {data:this.props.data};
//         this.handler1 = this.handler1.bind(this);
//     }

//     handler1(e){
//         this.setState ({data:'After Event'})
//     }

//     render(){
//         console.log("render");
//         return( <div className ="bordered">
//             <button onClick={this.handler1}>Click me</button>
//             <p>Yours data: {this.state.data}</p>

//         </div>
//         )
//     }
//  }