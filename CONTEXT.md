# 🧠 CONTEXT — Master Memory (read this first)

> **If you are a fresh chat / new session: read this entire file, then [RULES.md](RULES.md), then the latest file in [03-daily/](03-daily/). That is enough to resume teaching exactly where we left off.** This file is the single source of truth. It is updated at the end of every session.

---

## Who I am (the learner)
- **Background:** **2+ years professional developer** — JavaScript, **Nest.js, React, Next.js**. NOT a beginner programmer — strong at coding, logic, debugging, building apps. New only to **(a) Java syntax** and **(b) DSA / algorithmic thinking**. → *Teach Java fast via JS/TS comparisons (he knows the concepts, just needs the syntax). Go SLOW & deep on genuinely-new algorithmic concepts.*
- **DSA experience:** **Basically none** — built real apps but never did LeetCode/Big-O/algorithms seriously. So: fast through Java basics, deep & patient through DSA. Pacing tags are in ROADMAP (🟢 fast / 🟡 steady / 🔴 hard-give-extra-time).
- **OOP/classes:** Weak — only studied classes & OOP briefly in college, doesn't really know it. → *Teach item 0.7 (Classes & objects) from scratch but LIGHT and DSA-minimal: just fields, constructor, `new`, instance methods, `this` — enough to write a `ListNode`/`TreeNode` and a "design this data structure" class. Do NOT go deep on inheritance/polymorphism/abstract classes/design patterns (not needed for DSA interviews). Bridge from JS classes (`class`/`constructor`/`this` map almost 1:1).*
- **Java level:** Does **NOT know Java at all** — Phase 0 teaches the language from scratch (variables, types, conditionals, loops, references, methods, classes/objects) with NO DSA. Only after that do we touch complexity & patterns.
- **DSA level:** Complete beginner. Started from zero on 2026-06-02.
- **Goal:** Complete DSA mastery → **FAANG/MAANG-ready** in Java.
- **Time budget:** **2 hours/day**, aiming for 6 days/week + 1 weekly review day.
- **Wants:** Deep understanding (not memorization), a permanent Obsidian **notebook**, honest accountability.

## The goal, concretely
Solve a medium LeetCode-style problem in Java in ~25–30 min, explain brute-force → optimal out loud, state time/space complexity, handle edge cases — **and retain it long-term.**

## How we work (the daily flow — mastery-paced, NOT time-boxed)
> **The day ends when *I* feel I've understood enough — not when a timer runs out.** Times below are loose guides, not limits. Easy concepts: go further, cover more. Hard concepts: slow down, go deep, and finishing just ONE concept that day is a complete, valid day. Depth of understanding decides the day's length, not minutes. ~2 hrs is a typical day, but I set the stopping point based on satisfaction & comprehension.

1. **RECALL (~10–15m)** — Mentor quizzes me on due/yesterday topics *before* anything new. (Testing-first = retention.)
2. **LEARN** — New concept: what / why it exists / intuition / when NOT to use / tradeoffs. With **JS comparisons**. Take as long as the concept needs.
3. **PRACTICE** — Guided walk-through(s). On hard topics, do several small examples until it clicks.
4. **SOLVE** — I solve problem(s) by hand (I hand-type all code). Hints only, never the answer up front. Number of problems flexes with the day.
5. **NOTES** — I say **"generate notes"** → Mentor writes the Obsidian notebook entry in `01-concepts/` (+ problem note in `02-problems/`).
6. **LOG** — Mentor updates this file + `05-progress/` + `03-daily/`, then commits to Git.

**Stopping rule:** Mentor checks in ("do you feel solid on this, or want to go deeper / do another?") and lets ME decide when to close the day. A short deep day on a hard concept counts fully toward the streak.

Full detail: [RULES.md](RULES.md). Weekly flow: see "Weekly" in RULES.

## 📍 WHERE I AM RIGHT NOW  ← (the part that changes every day)
- **Phase:** 0 — Java language from zero (NO DSA yet)
- **Current roadmap item:** `0.7 Classes & Objects` (next session) — 0.1–0.6 DONE.
- **Last session:** Day 5 (2026-06-08) — item 0.6 References vs Values. Mastered: predicted every output, found the array `.equals()`-is-reference-cmp trap UNPROMPTED. Also: cross-machine recall verified (weekend work intact), Zoho-style aptitude drill 7/8 (only gap: `++` pre/post-increment, now a card).
- **Next action:** Recall due cards ([[References vs Values]] + `++` both due 06-09; [[Conditional Statements]] 06-09, [[Loops]] 06-10). Then teach `0.7 Classes & Objects` (DSA-minimal: fields, constructor, `new`, instance methods, `this`; bridge from JS classes; just enough for ListNode/TreeNode). Use Concept Scaffold: create `T07_ClassesAndObjects.java` with guiding comments, learner fills it.
- **RECALL STYLE (learner request, now in RULES):** code-output + tricky Zoho-aptitude-style questions, 3–5 per concept — NOT plain "what is X" definitions. Make him trace & predict output.
- **Streak:** 5 days 🔥
- **Weak topics to reinforce:** none yet
- **Notes generated so far:** [[Running a Java Program]], [[Variables and Types]], [[Conditional Statements]], [[Loops]], [[Methods]], [[References vs Values]]
- **Problems solved:** P01 Max in Array, P02 Sum of Array, P03 Linear Search — all `problem-solving/01-arrays/` (linear-scan family, O(n)/O(1)). Shared `TestRunner.java` harness (colored PASS/FAIL). Lessons: contract for "no answer" (throw vs sentinel), accumulator identity (sum→0), early return + `-1` sentinel.
- **Toolchain:** This device has **Temurin JDK 21 LTS** installed (winter 2026) + VS Code Java extensions. `javac`/`java` verified working. (Other machines may differ — check before running.)
- **src/ convention:** files named `T0x_Topic.java` (number prefix → topic-order sort; class name matches). Only create files for done/current topics, no future scaffolds.
- **IMPORTANT learner preference:** wants to **hand-type all code** themselves — give task + hints, never paste full solutions.

> Mentor: update the block above at the end of every session. It is how the next chat knows what to do.

## Folder responsibilities (why each exists)
| Folder | Why it exists |
|--------|---------------|
| `CONTEXT.md` (this) | Master memory. Resume point for any new chat. |
| `RULES.md` | How the Mentor must teach. The fine-tuned master prompt. |
| `ROADMAP.md` | The full zero→FAANG curriculum, mastery-gated. |
| `01-concepts/` | Permanent notebook — one deep note per topic. My forever-textbook. |
| `02-problems/` | One note per solved problem: problem + my solution + next-problem pointer. |
| `03-daily/` | One log per day. The source for tomorrow's recall. |
| `04-weekly/` | Weekly interleaved review + re-plan. |
| `05-progress/` | ONE dashboard: streak + mastery + stats. |
| `06-templates/` | The note shapes the Mentor fills in. |
| `src/` | My runnable Java code, mirrors `02-problems/`. |

## ⚠️ Git commit rules (IMPORTANT — applies on every machine)
Commits in this repo must be authored as **`Thowfik Juhair <thowfik.softdev@gmail.com>`** — this is the GitHub account email (`thowfik-softdev`) so commits link to the user's avatar/profile, NOT to "claude".
**Never** add a `Co-Authored-By` trailer, and **never** put the word "claude" or any AI attribution anywhere in a commit (author, committer, message, or contributor). The repo's identity is set in local git config, but if committing manually use:
```bash
git -c user.name="Thowfik Juhair" -c user.email="thowfik.softdev@gmail.com" commit -m "<message>"
```
This repo's **local git config is already set** to that identity, so a plain `git commit` / `git push` commits as the user with NO inline `-c` flags — it must look exactly like the user pushed it themselves. Use plain `git add` / `git commit -m` / `git push`. This rule lives here in CONTEXT so it travels with the repo when cloned to another machine — any assistant must follow it.

## 💻 Multi-machine note (learner switches machines: weekend = this one, weekdays = another)
The learner uses a **different machine on weekdays**. Everything is in git, so continuity = `git pull`. On ANY machine, at the start of a session, the Mentor should verify these (they're per-machine, NOT carried by git):
1. **`git pull`** first — get the latest pushed work.
2. **JDK present?** Run `java -version`. If missing, install a JDK (e.g. `winget install EclipseAdoptium.Temurin.21.JDK` on Windows), then reopen the terminal. *(This weekend machine has Temurin 21; a weekday machine may not.)*
3. **Git identity set?** A fresh clone does NOT inherit the local git config. Set it once per machine so commits attribute correctly:
   `git config user.name "Thowfik Juhair" && git config user.email "thowfik.softdev@gmail.com"` (see Git commit rules above — never any AI attribution).
4. **Boot the Mentor** — read CONTEXT.md → RULES.md → latest `03-daily/` to resume.

## Decisions we've made (so we don't relitigate)
- 2026-06-02: Rebuilt as **single-Mentor** system (no separate agents). Wiped v1 clean.
- 2026-06-02: **Recall-first** daily order chosen (testing before learning).
- 2026-06-02: Notes are **mandatory but on-demand** ("generate notes").
- 2026-06-02: Teach **Java via JavaScript comparisons** (learner knows Node).
- 2026-06-03: Commits authored as **Thowfik Juhair <thowfik.softdev@gmail.com>** (GitHub account email) — no co-author, never the word "claude" anywhere. Rebuilt `.git` fresh to purge old attribution. (See Git commit rules above.)
- 2026-06-03: **Learner hand-types ALL code** — Mentor gives task + hints only, never pastes full solutions.
- 2026-06-03: **Mastery-paced days, not time-boxed.** Learner decides when the day ends based on feeling satisfied/understanding. Hard concept = go deep, one concept can be a full day. Mentor checks in and lets learner set the stopping point.
- 2026-06-07: **Phase Consolidation Block** — after each phase's concepts (before advancing), solve ~8–12 problems per major pattern (🟢 2–3 easy / 🟡 5–7 medium / 🔴 1–2 hard), **mastery-gated not count-gated** (done when a new problem of the pattern is routine). Avoids the "solve all problems" trap; Phase 0 gets only light warm-ups (real blocks start Phase 1). Defined in [ROADMAP.md](ROADMAP.md) + [RULES.md](RULES.md).
- 2026-06-07: **Concept Scaffold** is the learner's preferred way to LEARN a new concept — Mentor creates the `src/` file first with simple plain-language `// comments` (a guided skeleton, NOT the solution), then guides the learner step-by-step in chat to hand-type it in. Lighter sibling of the Test-First Problem Drill; use by default for learning items. Full steps in [RULES.md](RULES.md).
- 2026-06-06: **Test-First Problem Drill** is the learner's preferred problem-solving format — Mentor scaffolds (test cases + edge-cases checklist + PASS/FAIL runner + empty method stub), learner hand-fills, then Mentor gives a HARSH code review, iterate to clean. Use by default for every `problem-solving/` problem. Full steps in [RULES.md](RULES.md). Also: `problem-solving/` (repo root) holds solved-problem CODE, categorized `NN-topic/P0x_Name.java` (numbers on folders since Java class names can't start with a digit); separate from `src/phase0-java-basics/` (language learning).
- 2026-06-04: Gap-checked roadmap vs a popular 6-month DSA syllabus. Added to Phase 5: **5.8 MST (Kruskal/Prim) + Floyd–Warshall**, **5.9 Bit Manipulation**, **5.10 Math & Number Theory** — these were the only real gaps. Deliberately deprioritized DBMS/OS/Networks/competitive-programming (campus-placement filler, not FAANG-DSA core; learner is an experienced dev).
