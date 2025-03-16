import {createRouter, createWebHashHistory} from 'vue-router';
import HomeView from '@/views/HomeView.vue';
import PlaneView from '@/views/PlaneView.vue';

const routes =[
    {
        path: '/',
        name: 'home',
        component: HomeView
    },
    {
        path: '/flight/:id',
        name: 'flight',
        component: PlaneView
    }
]

const router = createRouter({
    history: createWebHashHistory(),
    routes,
});

export default router;