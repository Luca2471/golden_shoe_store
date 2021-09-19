const baseURL = 'http://localhost:8081/'

export default {
  getStyles() {
    return fetch(`${baseURL}/shoeTypes`)
    .then(res => res.json())
  },

  getStyle(id) {
    return fetch(`${baseURL}/shoeTypes/${id}`)
    .then(res => res.json())
  },

  getModels() {
    return fetch(`${baseURL}/shoeModels`)
    .then(res => res.json())
  },

  getModel(id) {
    return fetch(`${baseURL}/shoeModels/${id}`)
    .then(res => res.json())
  }
}