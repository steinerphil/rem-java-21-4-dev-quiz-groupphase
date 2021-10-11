import * as React from 'react'
import Question from '../Question'
import styled from 'styled-components'

function Homepage({ questions }) {
  return (
    <QuestionsContainer>
      {questions.map(question => (
        <Question question={question} key={question.id} />
      ))}
    </QuestionsContainer>
  )
}
export default Homepage

const QuestionsContainer = styled.section`
  display: flex;
  gap: 15px;
  justify-content: center;
  border: 1px solid black;
  flex-wrap: wrap;
`
