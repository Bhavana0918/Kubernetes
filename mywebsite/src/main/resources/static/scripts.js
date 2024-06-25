document.getElementById('helloBtn').addEventListener('click', function() {
    fetch('/hello')
        .then(response => response.text())
        .then(data => {
            document.getElementById('helloMsg').innerText = data;
        });
});

document.getElementById('contactForm').addEventListener('submit', function(event) {
    event.preventDefault();
    
    const name = document.getElementById('name').value;
    const email = document.getElementById('email').value;
    const message = document.getElementById('message').value;
    
    fetch('/contact', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ name, email, message })
    })
    .then(response => response.json())
    .then(data => {
        document.getElementById('formMessage').innerText = data.message;
    });
});

