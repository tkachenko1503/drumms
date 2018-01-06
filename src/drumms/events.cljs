(ns drumms.events
  (:require [re-frame.core :as re-frame]
            [drumms.db :as db]
            [drumms.audio :refer [audio-map]]))


(defn initialize-db
  "Initialize db state"
  [& args]
  db/default-db)

(defn play
  "Handler for play event"
  [_ [_ sound]]
  {::play-sound sound})

(defn play-sound
  "Effect handler for playing sounds"
  [sound]
  (let [audio (get audio-map sound)]
    (doto audio
      (aset "currentTime" 0)
      (.play))))

(re-frame/reg-event-db
  ::initialize-db
  initialize-db)

(re-frame/reg-event-fx
  ::play
  play)

(re-frame/reg-fx
  ::play-sound
  play-sound)


;(re-frame/reg-event-db
;  ::set-active-panel
;  (fn [db [_ active-panel]]
;    (assoc db :active-panel active-panel)))
