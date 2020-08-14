

const box = document.querySelector('.alert')
const greetBtn = document.querySelector('.btn-primary')
const hideBtn = document.querySelector('.btn-danger')
const showBtn = document.querySelector('.btn-dark')

greetBtn.addEventListener('click', e => {
    box.innerText = "Hello..."
})

hideBtn.addEventListener('click', e => {
    box.style.display = "none"
})
showBtn.addEventListener('click', e => {
    box.style.display = "block"
})


const todosBtn = document.getElementById('todos-btn');
const todosEle=document.getElementById('todos')

todosBtn.addEventListener('click', e => {

    fetch("https://jsonplaceholder.typicode.com/todos?_limit=5")
        .then(response => response.json())
        .then(todos => {
            todosEle.innerHTML=todos.map(todo=>{
                return `
                
                    <li class="list-group-item"> 
                        <span class="badge badge-dark">${todo.id}</span>
                        <span>${todo.title}</span>
                        <span class="badge badge-warning">${todo.completed?'completed':'pending'}</span>
                    </li>
                
                `
            }).join(" ")
        })

})