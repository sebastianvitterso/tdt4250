const types = [
  'Container',
  'StopPlace',
  'Quay',
  'Trip',
  'Stop',
]


// json-struktur
export const container = {

  stopPlaces: [
    { // stopPlace 1
      id: "NSR:StopPlace:41613",
      quays: [ // containment
        {
          id: "NSR:Quay:71181",
          name: "Prinsens gate (P2)",
          x: 10.392115,
          y: 63.431194,
          compassBearing: 0,
          place: "Trondheim",
          stopPlaceType: "ON_STREET_BUS",
        },
        {
          stopPlaceId: "NSR:StopPlace:41613",
          id: "NSR:Quay:71184",
          name: "Prinsens gate (P1)",
          x: 10.391899,
          y: 63.430874,
          compassBearing: 180,
          place: "Trondheim",
          stopPlaceType: "ON_STREET_BUS",
        }
      ]
    },
    // ...
  ],

  trips: [
    {// trip 1
      tripID: "ATB:ServiceJourney:22_200109141599367_6041_200109141539610",
      date: "28.11.2020",
      line: "?",
      destination: "?",
      stops: [
        {
          time: "12:43",
          destination: "Strinda vgs.",
          busstopID: "NSR:Quay:73030",
          quay: {
            $ref: "NSR:Quay:73030",
          },
          aimedDepartureTime: "2020-11-28T12:43:00+0100",
          expectedDepartureTime: "2020-11-28T12:43:39+0100",
        },
        // ...
      ]
    },
    // ...
  ]
}