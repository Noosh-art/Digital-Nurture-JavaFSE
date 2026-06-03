console.log("Welcome to the Community Portal");

window.onload = function () {

    alert("Page Loaded Successfully");

    loadEvents();

};

/* Event Data */

const eventName = "Music Festival";
const eventDate = "20 June 2026";

let seats = 50;

console.log(`${eventName} on ${eventDate}`);

/* Event Class */

class Event {

    constructor(name, category, seats) {

        this.name = name;
        this.category = category;
        this.seats = seats;

    }

}

Event.prototype.checkAvailability = function () {

    return this.seats > 0;

};

/* Events Array */

let events = [

    new Event("Music Festival", "Music", 50),
    new Event("Baking Workshop", "Workshop", 30),
    new Event("Dance Show", "Dance", 20)

];

/* Add Event */

function addEvent(name, category, seats) {

    events.push(
        new Event(name, category, seats)
    );

}

/* Register User */

function registerUser(eventName) {

    try {

        let eventObj = events.find(
            e => e.name === eventName
        );

        if (!eventObj)
            throw "Event Not Found";

        if (eventObj.seats <= 0)
            throw "No Seats Available";

        eventObj.seats--;

        alert(
            "Registered for " + eventName
        );

        loadEvents();

    }

    catch (err) {

        alert(err);

    }

}

/* Filter */

function filterEventsByCategory(category) {

    return events.filter(
        event => event.category === category
    );

}

/* Closure */

function registrationTracker() {

    let total = 0;

    return function () {

        total++;

        console.log(
            "Total Registrations: " + total
        );

    };

}

const trackRegistration =
    registrationTracker();

/* Load Events */

function loadEvents() {

    let container =
        document.getElementById(
            "eventContainer"
        );

    if (!container)
        return;

    container.innerHTML = "";

    events.forEach(event => {

        let card =
            document.createElement("div");

        card.className =
            "eventCard";

        card.innerHTML =

            `<h3>${event.name}</h3>
             <p>${event.category}</p>
             <p>Seats: ${event.seats}</p>

             <button
             onclick="registerUser('${event.name}')">

             Register

             </button>`;

        container.appendChild(card);

    });

}

/* Search */

function searchEvents(event) {

    let keyword =
        event.target.value.toLowerCase();

    let cards =
        document.querySelectorAll(
            ".eventCard"
        );

    cards.forEach(card => {

        if (
            card.innerText
            .toLowerCase()
            .includes(keyword)
        ) {

            card.style.display =
                "block";

        }

        else {

            card.style.display =
                "none";

        }

    });

}

/* Form Submit */

function submitRegistration(event) {

    event.preventDefault();

    let form =
        document.forms["registrationForm"];

    let name =
        form.elements["name"].value;

    let email =
        form.elements["email"].value;

    let selected =
        form.elements["selectedEvent"].value;

    if (
        name === "" ||
        email === ""
    ) {

        alert(
            "Please fill all fields"
        );

        return;

    }

    sendRegistration({
        name,
        email,
        selected
    });

}

/* Fetch API */

function sendRegistration(data) {

    console.log(
        "Submitting...",
        data
    );

    setTimeout(() => {

        fetch(
            "https://jsonplaceholder.typicode.com/posts",
            {
                method: "POST",

                headers: {
                    "Content-Type":
                    "application/json"
                },

                body:
                JSON.stringify(data)
            }
        )

        .then(response =>
            response.json()
        )

        .then(result => {

            alert(
                "Registration Successful"
            );

            console.log(result);

        })

        .catch(error => {

            console.log(error);

        });

    }, 2000);

}

/* Async Await */

async function loadRemoteEvents() {

    try {

        let response =
            await fetch(
            "https://jsonplaceholder.typicode.com/posts"
            );

        let data =
            await response.json();

        console.log(data);

    }

    catch(error) {

        console.log(error);

    }

}

/* Modern JS */

const cloneEvents =
    [...events];

const {
    name,
    category
} = events[0];

console.log(
    name,
    category
);