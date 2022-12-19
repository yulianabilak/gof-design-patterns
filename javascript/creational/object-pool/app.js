import RentalStationPool from "./rental-station-pool.js";

const pool = new RentalStationPool();
let stations = [pool.getStation(), pool.getStation(), pool.getStation(), pool.getStation(), pool.getStation()];
console.log(stations);

pool.releaseStation(stations[2]);
stations.splice(2, 1);
stations[3] = pool.getStation();
console.log(stations);