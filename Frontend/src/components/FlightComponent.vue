<template>
    <div class="flight" @click="navigateToFlight(flight.id)">
        <div class="departure">
            <p id="departureAirport"> {{ flight.start }} </p>
            <p id="departureTime"> {{ flight.departureTime.slice(0, 10) }} </p>
            <p id="departureDate">{{ flight.departureTime.slice(11, 19) }}</p>
        </div>
        <div class="arrival">
            <p id="arrivalAirport"> {{ flight.end }} </p>
            <p id="arrivalTime"> {{ flight.landingTime.slice(0, 10) }} </p>
            <p id="arrivalDate"> {{ flight.landingTime.slice(11, 19) }} </p>
        </div>
    </div>
</template>

<script lang="ts">
export default {
    props: {
        flight: {
            type: Object,
            required: true
        }
    },
    methods: {
        navigateToFlight: function(id: bigint) {
            console.log("click");
            this.$router.push("/flight/" + id);
        }
    }
}

</script>

<style>
.flight{
    display: flex;
    flex-direction: row;
    justify-content: space-between;
    align-items: center;
    gap: 300px;
    margin: auto;
    width: 80%;
    pointer-events: all;
    cursor: pointer;
    padding-right: 400px;
    background-color: rgba(255, 38, 0, 0.1);
}
.departure,
.arrival{
    display: flex;
    flex-direction: column;
}
/*
.departure {
    padding-right: 600px;
}
    */
</style>