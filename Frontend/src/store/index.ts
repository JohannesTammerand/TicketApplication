import {createStore} from 'vuex';

export default createStore({
    state: {
        flights: []
    },
    mutations: {
        setFlights(state: { flights: any; }, flights: any){
            state.flights = flights;
        }
    },
    actions: {
        async fetchFlights({ commit }) {
            try {
                const response = await fetch('http://localhost:8080/api/flights', {
                    method: 'GET'
                });
                if (!response.ok) {
                    throw new Error(`HTTP error! Status: ${response.status}`);
                }
                const data = await response.json();
                console.log('a', data)
                commit('setFlights', data);
            } catch (error) {
                console.error("Error fetching flights:", error);
            }
        }
    },
    getters: {
        allFlights: (state: { flights: any; }) => state.flights
    }
})