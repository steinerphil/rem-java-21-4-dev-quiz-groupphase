import * as React from 'react'
import styled from 'styled-components'
import { useState } from 'react'
import NewQuestion from '../NewQuestion'

export default function AddQuestion() {
  const [question, setQuestions] = useState({
    questionText: '',
    answers: [
      {
        answerText: '',
        correct: false,
      },
      {
        answerText: '',
        correct: false,
      },
    ],
  })

  const handleAnswerTextInput = (e, index) => {
    const newQuestionObject = { ...question }
    newQuestionObject.answers[index].answerText = e.target.value

    setQuestions(newQuestionObject)
  }

  const handleAnswerCorrectStatusChange = (e, index) => {
    const newQuestionObject = { ...question }

    for (let i = 0; i < newQuestionObject.answers.length; i++) {
      newQuestionObject.answers[i].correct = i === index
    }
    console.log(newQuestionObject)
    setQuestions(newQuestionObject)
  }
  return (
    <section>
      <h2>Add Question Page</h2>
      <NewQuestion
        answers={question.answers}
        handleAnswerTextInput={handleAnswerTextInput}
        handleAnswerCorrectStatusChange={handleAnswerCorrectStatusChange}
      />
    </section>
  )
}
