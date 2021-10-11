import Header from './components/Header'
import { Route, Switch } from 'react-router-dom'
import { useEffect, useState } from 'react'
import Homepage from './components/Pages/Homepage'
import { addQuestion, getQuestions } from './service/DevQuizApiService'
import AddQuestion from './components/Pages/Add-Question'

function App() {
  const [questions, setQuestions] = useState([])

  useEffect(() => {
    getQuestions().then(result => setQuestions(result))
  }, [])

  const saveQuestion = newQuestion => {
    addQuestion(newQuestion)
    getQuestions().then(result => setQuestions(result))
  }
  return (
    <div className="App">
      <Header />
      <Switch>
        <Route exact path="/">
          <Homepage questions={questions} />
        </Route>
        <Route exact path="/add-question">
          <AddQuestion saveQuestion={saveQuestion} />
        </Route>
      </Switch>
    </div>
  )
}

export default App
