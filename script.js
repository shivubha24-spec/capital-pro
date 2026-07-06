// Capital Pro

document.addEventListener("DOMContentLoaded", () => {

  const btns = document.querySelectorAll("button");

  btns.forEach(btn => {

    btn.addEventListener("mouseenter", () => {
      btn.style.transform = "scale(1.05)";
      btn.style.transition = "0.3s";
    });

    btn.addEventListener("mouseleave", () => {
      btn.style.transform = "scale(1)";
    });

  });

  console.log("Capital Pro Loaded Successfully");

});