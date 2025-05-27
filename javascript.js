// main.js

// 1. JavaScript Basics & Setup
console.log("Welcome to the Community Portal");
window.onload = () => alert("Page fully loaded");

// 2. Syntax, Data Types, and Operators
const eventName = "Community Meetup";
const eventDate = "2025-06-01";
let availableSeats = 50;
console.log(`Event: ${eventName}, Date: ${eventDate}, Seats: ${availableSeats}`);
availableSeats--;

// 3. Conditionals, Loops, and Error Handling
const events = [
    { name: "Music Fest", date: "2025-07-01", seats: 10, category: "Music" },
    { name: "Tech Talk", date: "2024-01-01", seats: 0, category: "Technology" },
    { name: "Food Fair", date: "2025-08-10", seats: 5, category: "Food" }
];

events.forEach(event => {
    if (new Date(event.date) > new Date() && event.seats > 0) {
        console.log(`Upcoming: ${event.name}`);
    }
});

function register(event) {
    try {
        if (event.seats > 0) {
            event.seats--;
        } else {
            throw new Error("No seats available");
        }
    } catch (e) {
        console.error(e.message);
    }
}

// 4. Functions, Scope, Closures, Higher-Order Functions
function addEvent(name, date, seats, category) {
    events.push({ name, date, seats, category });
}

function registerUser(eventName) {
    const event = events.find(e => e.name === eventName);
    register(event);
}

function filterEventsByCategory(category) {
    return events.filter(e => e.category === category);
}

function registrationTracker() {
    let total = 0;
    return function () {
        total++;
        return total;
    };
}
const trackMusicRegistrations = registrationTracker();

function dynamicSearch(callback) {
    return events.filter(callback);
}

// 5. Objects and Prototypes
function Event(name, date, seats, category) {
    this.name = name;
    this.date = date;
    this.seats = seats;
    this.category = category;
}
Event.prototype.checkAvailability = function () {
    return this.seats > 0;
};
const e1 = new Event("Art Expo", "2025-07-15", 20, "Art");
console.log(Object.entries(e1));

// 6. Arrays and Methods
events.push({ name: "Baking Workshop", date: "2025-09-10", seats: 15, category: "Food" });
const musicEvents = events.filter(e => e.category === "Music");
const eventCards = events.map(e => `Card: ${e.name} on ${e.date}`);

// 7. DOM Manipulation
document.querySelectorAll("#eventList").forEach(list => {
    events.forEach(e => {
        const card = document.createElement("div");
        card.innerText = `${e.name} - ${e.date}`;
        list.appendChild(card);
    });
});

// 8. Event Handling
document.querySelectorAll(".registerBtn").forEach(btn => {
    btn.onclick = () => alert("Registered!");
});
document.querySelector("#categoryFilter").onchange = (e) => {
    const filtered = filterEventsByCategory(e.target.value);
    console.log("Filtered Events: ", filtered);
};
document.querySelector("#searchInput").onkeydown = (e) => {
    if (e.key === "Enter") {
        const keyword = e.target.value.toLowerCase();
        const results = events.filter(ev => ev.name.toLowerCase().includes(keyword));
        console.log("Search results:", results);
    }
};

// 9. Async JS, Promises, Async/Await
function fetchEvents() {
    return new Promise((resolve) => {
        setTimeout(() => {
            resolve(events);
        }, 1000);
    });
}
fetchEvents()
    .then(data => console.log("Fetched Events:", data))
    .catch(err => console.error("Fetch failed", err));

async function loadEvents() {
    const spinner = document.getElementById("spinner");
    spinner.style.display = "block";
    try {
        const data = await fetchEvents();
        console.log("Async/Await Events:", data);
    } finally {
        spinner.style.display = "none";
    }
}

// 10. Modern JavaScript Features
function greetUser(name = "Guest") {
    console.log(`Welcome, ${name}`);
}
const { name: eventTitle, date: eventDate2 } = events[0];
const clonedEvents = [...events];

// 11. Working with Forms
document.querySelector("#registerForm").addEventListener("submit", function (e) {
    e.preventDefault();
    const name = this.elements["name"].value;
    const email = this.elements["email"].value;
    const selectedEvent = this.elements["event"].value;

    if (!name || !email) {
        document.getElementById("error").innerText = "Please fill all fields";
        return;
    }

    console.log("Form Submitted", { name, email, selectedEvent });
});

// 12. AJAX & Fetch API
function postRegistration(data) {
    console.log("Sending data:", data);
    return new Promise((resolve) => {
        setTimeout(() => resolve("Success"), 1000);
    });
}
document.querySelector("#registerForm").addEventListener("submit", async function (e) {
    e.preventDefault();
    const name = this.elements["name"].value;
    const email = this.elements["email"].value;

    const response = await postRegistration({ name, email });
    alert(`Registration ${response}`);
});

// 13. Debugging and Testing
console.log("Debug: Starting registration flow");
try {
    const test = { name: "Debug Test", seats: 0 };
    register(test);
} catch (err) {
    console.error("Caught error:", err);
}

// 14. jQuery and JS Frameworks
$(document).ready(function () {
    $('#registerBtn').click(() => alert("jQuery Register Clicked"));
    $('.eventCard').fadeIn().fadeOut();
    console.log("Frameworks like React allow better component reusability and state management.");
});
