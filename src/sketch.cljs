(ns sketch
  (:require [goog.object :as g]
            [p5 :as p5]))

(defn setup[]
  (js/createCanvas js/window.innerWidth js/window.innerHeight))

(defn draw[]
  (js/background 255 0 0 ))

(defn windowResized[]
  (js/resizeCanvas js/window.innerWidth js/window.innerHeight))

(doto js/window
  (g/set "setup" setup)
  (g/set "draw" draw)
  (g/set "windowResized" windowResized))
