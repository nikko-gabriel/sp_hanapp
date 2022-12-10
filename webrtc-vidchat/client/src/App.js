import React from 'react';
import { BrowserRouter, Route, Switch } from "react-router-dom";
import CreateRoom  from './routes/CreateRoom';
import logo from './logo.svg';
import './App.css';

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Switch>
          <Route path="/" exact component={CreateRoom} />
          <Route path="/room/:roomID" component={Room} />
        </Switch>
      </BrowserRouter>
    </div>
  );
}

export default App;
