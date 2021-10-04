const baseURL = 'http://localhost:8080/'

export default {
  getStyles() {
    return fetch(`${baseURL}/shoeTypes`)
    .then(res => res.json());
  },

  getStyle(id) {
    return fetch(`${baseURL}/shoeTypes/${id}`)
    .then(res => res.json());
  },

  getModels() {
    return fetch(`${baseURL}/shoeModels`)
    .then(res => res.json());
  },

  getModel(id) {
    return fetch(`${baseURL}/shoeModels/${id}`)
    .then(res => res.json());
  },

  getModelsByGenderAndStyle(gender, style) {
    return fetch(`${baseURL}/shoeModels/category/${gender}/${style}`)
    .then(res => res.json());
  },

  getStylesByGender(gender) {
    return fetch(`${baseURL}/shoeTypes/category/${gender}`)
    .then(res => res.json());
  },

  getShoesByGender(gender) {
    return fetch(`${baseURL}/shoeModels/gender/${gender}`)
    .then(res => res.json());
  },

  getShoesByStyle(category) {
    return fetch(`${baseURL}/shoeTypes/category/${category}`)
    .then(res => res.json());
  },
}