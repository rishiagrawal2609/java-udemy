package com.javaUdemy.MultiThreading;

//runnable Interface method
class Task1a extends Thread {
	@Override
	public void run() { // should match the exact signature

		System.out.print("Task 1 start \n");

		for (int i = 101; i <= 199; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\n Task1 complete");

	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		System.out.print("Task 2 start \n");

		for (int i = 201; i <= 299; i++) {
			System.out.print(i + " ");
		}
		Thread.yield();
		System.out.println("\n Task2 complete");

	}

}

public class ThreadsRunnableInterfaceRunner {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// using thread class

		// Task1
		Task1a task1 = new Task1a(); // new state - Ready to execute

		// task1.run(); ---> Do not use this
		task1.setPriority(10);
		task1.start();

		// Task2
		Task2 task2 = new Task2();
		Thread task2thread = new Thread(task2);// need to provide the Runnable interface to thread class //thread is

		// ready - New State
		task2thread.setPriority(1);
		task2thread.start();

		// wait for the task 1 and 2 to complete
		task1.join();
		task2thread.join();

		// Task3

		Thread.sleep(10000); // Adds the delay and is in milliseconds

		System.out.print("Task 3 start \n");
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\n Task3 complete");

		System.out.println("\n Program complete");

	}

}

//syncronised is the class that can be extended to make sure it run as in one thread only

/*
 * States of thread New Runnable Running Blocked/Waiting Terminated/Dead
 */
//state is blocked when its waiting for the external response.
/*
 * Task 1 start Task 3 start Task 2 start 301 - This point Task 3 is running,
 * task 1 and 2 are waiting 201 - This point Task 2 is running, task 3 and 1 are
 * waiting 101 102 103 104 105 106 107 108 109 - Task 1 is running till here 302
 * 202 203 204 205 206 207 208 209 210 211 212 213 214 215 216 217 218 110 111
 * 303 219 112 304 220 113 305 306 307 308 309 310 311 312 313 221 222 223 224
 * 225 226 227 228 114 314 229 230 231 232 115 116 117 118 119 120 121 122 315
 * 233 123 316 234 235 236 237 238 239 240 124 317 241 242 243 244 245 125 318
 * 319 320 321 322 323 324 246 247 248 249 250 251 252 253 126 127 128 129 130
 * 131 132 133 325 254 255 256 257 258 259 260 261 134 135 136 137 138 139 326
 * 140 141 142 143 262 327 144 263 328 329 145 264 330 146 147 148 149 150 151
 * 152 153 154 265 266 267 331 332 333 334 335 155 268 269 270 271 272 273 274
 * 275 336 337 338 339 340 341 342 343 156 276 277 278 279 280 281 282 283 344
 * 345 346 347 348 349 350 351 157 284 285 286 287 288 289 290 291 352 353 354
 * 355 356 357 358 359 158 292 293 294 295 296 360 159 361 297 160 362 363 364
 * 298 161 162 163 164 165 365 299 166 366 367 368 369 370 371 372 373 Task2
 * complete //Terminated state 167 168 169 170 171 172 173 174 374 375 376 377
 * 378 379 175 380 176 177 178 179 180 181 182 381 382 383 384 183 184 185 186
 * 385 187 188 189 190 191 192 193 194 386 387 388 389 390 391 392 195 196 197
 * 198 199 Task1 complete //Terminated State 393 394 395 396 397 398 399 Task3
 * complete //Terminated state
 * 
 * Program complete //Terminated state
 */
