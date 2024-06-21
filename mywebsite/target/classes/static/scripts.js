document.getElementById('helloBtn').addEventListener('click', function() {
    fetch('/hello')
        .then(response => response.text())
        .then(data => {
            document.getElementById('helloMsg').innerText = data;
        });
});
