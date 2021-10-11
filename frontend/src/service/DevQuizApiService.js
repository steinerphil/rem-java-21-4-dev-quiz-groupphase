import axios from 'axios'

function getQuestions() {
  return axios
    .get('/api/question')
    .then(response => response.data)
    .catch(err => console.error(err))
}
export { getQuestions }
