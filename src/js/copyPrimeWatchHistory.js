// Grabs all the titles and dates from the Prime Video watch history page and copies them to the clipboard
copy(
  [...document.querySelectorAll('li[data-automation-id]')].map((e) => {
    const title = e.querySelector('a:last-child').textContent;
    const date = e.parentElement.previousElementSibling.textContent;
    return `${date}\t${title}`;
  }).join('\n')
)