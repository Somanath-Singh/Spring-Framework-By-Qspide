console.log("Script Loaded Successfully");

let currentTheme = getTheme();

document.addEventListener("DOMContentLoaded", (event) => {
  changeTheme();
});



function changeTheme() {
  changePageTheme(currentTheme, currentTheme);
  //document.querySelector('html').classList.add(currentTheme);

  //set the listener to change theme button
  const changeButton = document.querySelector("#theme_change_button");
  //change the text of the button
  //changeButton.querySelector("span").textContent = currentTheme == "light" ? " Dark" : " Light";

  changeButton.addEventListener("click", () => {
    let oldtheme = currentTheme;
    if (currentTheme === "dark") {
      currentTheme = "light";
    }
    else {
      currentTheme = "dark";
    }
    changePageTheme(currentTheme, oldtheme);
  })
}

//set theme to localStorage
function setTheme(theme) {
  localStorage.setItem("theme", theme);
}

//get theme to LocalStorage
function getTheme() {
  let theme = localStorage.getItem("theme");
  if (theme) {
    return theme;
  } else {
    return "light";
  }
}


//change the current page theme
function changePageTheme(theme, oldtheme) {

  setTheme(currentTheme);
  //remove the old theme
  document.querySelector('html').classList.remove(oldtheme);
  //set the current theme
  document.querySelector('html').classList.add(theme);

  //change the text of the button
  document.querySelector('#theme_change_button').querySelector("span").textContent = theme == "light" ? " Dark" : " Light";

}