const name = document.getElementById('name')
const relationship = document.getElementById('relationship')
const phone = document.getElementById('phone')
const street = document.getElementById('address.street')
const city = document.getElementById('address.city')
const state = document.getElementById('address.state')
const form = document.getElementById('newContact')
const errorElement = document.getElementById('error')

form.addEventListener('submit', (e) => {
let messages = []
if (relationship.value.length >= 15) {
messages.push('Relationship must be less than 15 characters')
}
if (phone.value.length >= 15) {
messages.push('Too many characters for the phone number. Please use the format and at most 14 charaters: x-xxx-xxx-xxxx OR xxx-xxx-xxxx OR just the digit.')
}
if (street.value.length >= 40) {
messages.push('Address must be less than 40 characters')
}
if (city.value.length >= 20) {
messages.push('City must be less than 20 characters')
}
if (state.value.length >= 20) {
messages.push('State must be less than 20 characters')
})