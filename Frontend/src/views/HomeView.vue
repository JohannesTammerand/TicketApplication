

<template>
    <div class="main">
        <div class="flights-container">
        <FlightComponent
            v-for="flight in flights"
            :key="flight.id"
            :flight="flight"
            class="flight"
        />
        </div>
    </div>
</template>

<script lang="ts">
import { mapGetters } from 'vuex';
import FlightComponent from '@/components/FlightComponent.vue';

export default {
    name: "HomeView",
    components: {
        FlightComponent
    },
    computed: {
        ...mapGetters(['allFlights']),
        flights() {
            console.log('Flights', this.allFlights);
            return this.allFlights;
        }
    },
    mounted() {
        this.$store.dispatch('fetchFlights');
    },
};

</script>

<style>
.flights-container{
    width: 50%;
    /* align-items: center; */
}

.main{
    width: 100%;
    display: flex;
    align-content: center;
}
</style>