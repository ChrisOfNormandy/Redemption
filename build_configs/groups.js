const main = require('./main');
const mod_id = main.mod_id;

// This includes the pattern. An empty JSON Array works too.
const groups = [
    { registryName: `itemGroup.${mod_id}_blocks`, name: "Masonry | Blocks" },
    { registryName: `itemGroup.${mod_id}_stairs`, name: "Masonry | Stairs" },
    { registryName: `itemGroup.${mod_id}_slabs`, name: "Masonry | Slabs" },
    { registryName: `itemGroup.${mod_id}_walls`, name: "Masonry | Walls" },
    { registryName: `itemGroup.${mod_id}_items`, name: "Masonry | Items" }
];

module.exports = groups;