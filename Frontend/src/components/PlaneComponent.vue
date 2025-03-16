<template>
    <div v-for="i in plane.rows">
        <div v-for="j in plane.columns" class="seat">
            <p>{{ i }}{{ j }}</p>
        </div>
    </div>
</template>

<script lang="ts">

</script>