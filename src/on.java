
final class on extends kp {

   private int u;
   private boolean r;
   private int q;
   private int A;
   private int t;
   private int n;
   private int s;
   private int p;
   private int B;
   private int o;
   private int z;
   private int x;
   private int w;
   private int y;
   private int v;


   private final boolean j() {
      int var1 = this.n;
      int var2;
      int var3;
      if(var1 == Integer.MIN_VALUE) {
         var3 = 0;
         var2 = 0;
         var1 = 0;
      } else {
         var2 = a(var1, this.q);
         var3 = d(var1, this.q);
      }

      if(this.t == var1 && this.v == var2 && this.z == var3) {
         if(this.n == Integer.MIN_VALUE) {
            this.n = 0;
            this.z = 0;
            this.v = 0;
            this.t = 0;
            this.a((byte)88);
            return true;
         } else {
            this.i();
            return false;
         }
      } else {
         if(this.t < var1) {
            this.o = 1;
            this.A = var1 - this.t;
         } else if(this.t > var1) {
            this.o = -1;
            this.A = this.t - var1;
         } else {
            this.o = 0;
         }

         if(this.v < var2) {
            this.s = 1;
            if(this.A == 0 || this.A > var2 - this.v) {
               this.A = var2 - this.v;
            }
         } else if(this.v > var2) {
            this.s = -1;
            if(this.A == 0 || this.A > this.v - var2) {
               this.A = this.v - var2;
            }
         } else {
            this.s = 0;
         }

         if(this.z < var3) {
            this.u = 1;
            if(this.A == 0 || this.A > var3 - this.z) {
               this.A = var3 - this.z;
            }
         } else if(this.z > var3) {
            this.u = -1;
            if(this.A == 0 || this.A > this.z - var3) {
               this.A = this.z - var3;
            }
         } else {
            this.u = 0;
         }

         return false;
      }
   }

   private static final int b(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, on var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.v += var9.s * (var6 - var3);
      var9.z += var9.u * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      var9.t = var4 >> 2;
      var9.y = var2 << 8;
      return var3;
   }

   private final void k() {
      if(this.A != 0) {
         if(this.n == Integer.MIN_VALUE) {
            this.n = 0;
         }

         this.A = 0;
         this.i();
      }

   }

   private static final int b(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, on var13, int var14, int var15) {
      var13.t -= var13.o * var5;
      if(var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      int var10001;
      byte var16;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         var16 = var2[var1];
         var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if(var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var16 = var2[var4 >> 8];
         var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.t += var13.o * var5;
      var13.v = var6;
      var13.z = var7;
      var13.y = var4;
      return var5;
   }

   private static final int b(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, on var11, int var12, int var13) {
      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      int var10001;
      byte var14;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var0 = (var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if(var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.y = var4;
      return var5 >> 1;
   }

   final synchronized int l() {
      return this.q < 0?-1:this.q;
   }

   final synchronized int f() {
      return this.w < 0?-this.w:this.w;
   }

   private final int b(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if(this.A > 0) {
            int var6 = var2 + this.A;
            if(var6 > var4) {
               var6 = var4;
            }

            this.A += var2;
            if(this.w == 256 && (this.y & 255) == 0) {
               if(df.g) {
                  var2 = a(0, ((hb)this.k).k, var1, this.y, var2, this.v, this.z, this.s, this.u, 0, var6, var3, this);
               } else {
                  var2 = a(((hb)this.k).k, var1, this.y, var2, this.t, this.o, 0, var6, var3, this);
               }
            } else if(df.g) {
               var2 = b(0, 0, ((hb)this.k).k, var1, this.y, var2, this.v, this.z, this.s, this.u, 0, var6, var3, this, this.w, var5);
            } else {
               var2 = a(0, 0, ((hb)this.k).k, var1, this.y, var2, this.t, this.o, 0, var6, var3, this, this.w, var5);
            }

            this.A -= var2;
            if(this.A != 0) {
               return var2;
            }

            if(!this.j()) {
               continue;
            }

            return var4;
         }

         if(this.w == 256 && (this.y & 255) == 0) {
            if(df.g) {
               return b(0, ((hb)this.k).k, var1, this.y, var2, this.v, this.z, 0, var4, var3, this);
            }

            return b(((hb)this.k).k, var1, this.y, var2, this.t, 0, var4, var3, this);
         }

         if(df.g) {
            return b(0, 0, ((hb)this.k).k, var1, this.y, var2, this.v, this.z, 0, var4, var3, this, this.w, var5);
         }

         return b(0, 0, ((hb)this.k).k, var1, this.y, var2, this.t, 0, var4, var3, this, this.w, var5);
      }
   }

   final synchronized int g() {
      return this.n == Integer.MIN_VALUE?0:this.n;
   }

   private static final int c(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, on var11, int var12, int var13) {
      var11.v -= var11.s * var5;
      var11.z -= var11.u * var5;
      if(var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var0 = var13;

      for(var1 = var12; var5 < var8; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.v += var11.s * var5;
      var11.z += var11.u * var5;
      var11.t = var6;
      var11.y = var4;
      return var5;
   }

   private final synchronized void b(int var1, int var2) {
      this.n = var1;
      this.q = var2;
      this.A = 0;
      this.i();
   }

   final synchronized void h(int var1) {
      if(this.w < 0) {
         this.w = -var1;
      } else {
         this.w = var1;
      }

   }

   private static final int b(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, on var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if((var9 = var4 + var3 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.t += var12.o * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      int var10001;
      byte var13;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.v = var5 >> 2;
      var12.z = var6 >> 2;
      var12.y = var3 << 8;
      return var4 >> 1;
   }

   final synchronized void a(int var1) {
      if(this.A > 0) {
         if(var1 >= this.A) {
            if(this.n == Integer.MIN_VALUE) {
               this.n = 0;
               this.z = 0;
               this.v = 0;
               this.t = 0;
               this.a((byte)93);
               var1 = this.A;
            }

            this.A = 0;
            this.i();
         } else {
            this.t += this.o * var1;
            this.v += this.s * var1;
            this.z += this.u * var1;
            this.A -= var1;
         }
      }

      hb var2 = (hb)this.k;
      int var3 = this.p << 8;
      int var4 = this.B << 8;
      int var5 = var2.k.length << 8;
      int var6 = var4 - var3;
      if(var6 <= 0) {
         this.x = 0;
      }

      if(this.y < 0) {
         if(this.w <= 0) {
            this.k();
            this.a((byte)100);
            return;
         }

         this.y = 0;
      }

      if(this.y >= var5) {
         if(this.w >= 0) {
            this.k();
            this.a((byte)103);
            return;
         }

         this.y = var5 - 1;
      }

      this.y += this.w * var1;
      if(this.x < 0) {
         if(!this.r) {
            if(this.w < 0) {
               if(this.y >= var3) {
                  return;
               }

               this.y = var4 - 1 - (var4 - 1 - this.y) % var6;
            } else {
               if(this.y < var4) {
                  return;
               }

               this.y = var3 + (this.y - var3) % var6;
            }

         } else {
            if(this.w < 0) {
               if(this.y >= var3) {
                  return;
               }

               this.y = var3 + var3 - 1 - this.y;
               this.w = -this.w;
            }

            while(this.y >= var4) {
               this.y = var4 + var4 - 1 - this.y;
               this.w = -this.w;
               if(this.y >= var3) {
                  return;
               }

               this.y = var3 + var3 - 1 - this.y;
               this.w = -this.w;
            }

         }
      } else {
         if(this.x > 0) {
            if(this.r) {
               label122: {
                  if(this.w < 0) {
                     if(this.y >= var3) {
                        return;
                     }

                     this.y = var3 + var3 - 1 - this.y;
                     this.w = -this.w;
                     if(--this.x == 0) {
                        break label122;
                     }
                  }

                  do {
                     if(this.y < var4) {
                        return;
                     }

                     this.y = var4 + var4 - 1 - this.y;
                     this.w = -this.w;
                     if(--this.x == 0) {
                        break;
                     }

                     if(this.y >= var3) {
                        return;
                     }

                     this.y = var3 + var3 - 1 - this.y;
                     this.w = -this.w;
                  } while(--this.x != 0);
               }
            } else {
               label132: {
                  int var7;
                  if(this.w < 0) {
                     if(this.y >= var3) {
                        return;
                     }

                     var7 = (var4 - 1 - this.y) / var6;
                     if(var7 >= this.x) {
                        this.y += var6 * this.x;
                        this.x = 0;
                        break label132;
                     }

                     this.y += var6 * var7;
                     this.x -= var7;
                  } else {
                     if(this.y < var4) {
                        return;
                     }

                     var7 = (this.y - var3) / var6;
                     if(var7 >= this.x) {
                        this.y -= var6 * this.x;
                        this.x = 0;
                        break label132;
                     }

                     this.y -= var6 * var7;
                     this.x -= var7;
                  }

                  return;
               }
            }
         }

         if(this.w < 0) {
            if(this.y < 0) {
               this.y = -1;
               this.k();
               this.a((byte)24);
            }
         } else if(this.y >= var5) {
            this.y = var5;
            this.k();
            this.a((byte)49);
         }

      }
   }

   private static final int d(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, on var11, int var12, int var13) {
      if(var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if(var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.y = var4;
      return var5 >> 1;
   }

   final kp b() {
      return null;
   }

   final synchronized void e(int var1) {
      this.x = var1;
   }

   private static final int a(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, on var11, int var12, int var13) {
      var11.v -= var11.s * var5;
      var11.z -= var11.u * var5;
      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      int var10001;
      byte var14;
      while(var5 < var8) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if(var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.v += var11.s * var5;
      var11.z += var11.u * var5;
      var11.t = var6;
      var11.y = var4;
      return var5;
   }

   final kp a() {
      return null;
   }

   private final int a(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if(this.A > 0) {
            int var6 = var2 + this.A;
            if(var6 > var4) {
               var6 = var4;
            }

            this.A += var2;
            if(this.w == -256 && (this.y & 255) == 0) {
               if(df.g) {
                  var2 = b(0, ((hb)this.k).k, var1, this.y, var2, this.v, this.z, this.s, this.u, 0, var6, var3, this);
               } else {
                  var2 = b(((hb)this.k).k, var1, this.y, var2, this.t, this.o, 0, var6, var3, this);
               }
            } else if(df.g) {
               var2 = a(0, 0, ((hb)this.k).k, var1, this.y, var2, this.v, this.z, this.s, this.u, 0, var6, var3, this, this.w, var5);
            } else {
               var2 = c(0, 0, ((hb)this.k).k, var1, this.y, var2, this.t, this.o, 0, var6, var3, this, this.w, var5);
            }

            this.A -= var2;
            if(this.A != 0) {
               return var2;
            }

            if(!this.j()) {
               continue;
            }

            return var4;
         }

         if(this.w == -256 && (this.y & 255) == 0) {
            if(df.g) {
               return a(0, ((hb)this.k).k, var1, this.y, var2, this.v, this.z, 0, var4, var3, this);
            }

            return a(((hb)this.k).k, var1, this.y, var2, this.t, 0, var4, var3, this);
         }

         if(df.g) {
            return d(0, 0, ((hb)this.k).k, var1, this.y, var2, this.v, this.z, 0, var4, var3, this, this.w, var5);
         }

         return a(0, 0, ((hb)this.k).k, var1, this.y, var2, this.t, 0, var4, var3, this, this.w, var5);
      }
   }

   private static final int a(int var0, int var1) {
      return var1 < 0?var0:(int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
   }

   final boolean e() {
      return this.y < 0 || this.y >= ((hb)this.k).k.length << 8;
   }

   private static final int a(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, on var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if((var7 = var4 + var3 - (var9 - 1)) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      byte var11;
      int var10001;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.y = var3 << 8;
      return var4 >> 1;
   }

   final synchronized void c(int var1, int var2) {
      this.a(var1, var2, this.l());
   }

   private static final int a(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, on var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if((var9 = var4 + var11 - var3) > var10) {
         var9 = var10;
      }

      var12.t += var12.o * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      int var10001;
      byte var13;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.v = var5 >> 2;
      var12.z = var6 >> 2;
      var12.y = var3 << 8;
      return var4 >> 1;
   }

   private final void i() {
      this.t = this.n;
      this.v = a(this.n, this.q);
      this.z = d(this.n, this.q);
   }

   final synchronized void g(int var1) {
      this.b(this.g(), var1);
   }

   private final synchronized void b(int var1) {
      this.b(var1, this.l());
   }

   private static final int a(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, on var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if((var5 = var3 + var2 - (var7 - 1)) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
      }

      var8.y = var2 << 8;
      return var3;
   }

   private static final int b(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, on var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if((var7 = var4 + var9 - var3) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      byte var11;
      int var10001;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.y = var3 << 8;
      return var4 >> 1;
   }

   static final on a(hb var0, int var1, int var2, int var3) {
      return var0.k != null && var0.k.length != 0?new on(var0, var1, var2, var3):null;
   }

   final int c() {
      int var1 = this.t * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if(this.x == 0) {
         var1 -= var1 * this.y / (((hb)this.k).k.length << 8);
      } else if(this.x >= 0) {
         var1 -= var1 * this.p / ((hb)this.k).k.length;
      }

      return var1 > 255?255:var1;
   }

   final synchronized void b(int[] var1, int var2, int var3) {
      if(this.n == 0 && this.A == 0) {
         this.a(var3);
      } else {
         hb var4 = (hb)this.k;
         int var5 = this.p << 8;
         int var6 = this.B << 8;
         int var7 = var4.k.length << 8;
         int var8 = var6 - var5;
         if(var8 <= 0) {
            this.x = 0;
         }

         int var9 = var2;
         var3 += var2;
         if(this.y < 0) {
            if(this.w <= 0) {
               this.k();
               this.a((byte)124);
               return;
            }

            this.y = 0;
         }

         if(this.y >= var7) {
            if(this.w >= 0) {
               this.k();
               this.a((byte)71);
               return;
            }

            this.y = var7 - 1;
         }

         if(this.x < 0) {
            if(this.r) {
               if(this.w < 0) {
                  var9 = this.a(var1, var2, var5, var3, var4.k[this.p]);
                  if(this.y >= var5) {
                     return;
                  }

                  this.y = var5 + var5 - 1 - this.y;
                  this.w = -this.w;
               }

               while(true) {
                  var9 = this.b(var1, var9, var6, var3, var4.k[this.B - 1]);
                  if(this.y < var6) {
                     return;
                  }

                  this.y = var6 + var6 - 1 - this.y;
                  this.w = -this.w;
                  var9 = this.a(var1, var9, var5, var3, var4.k[this.p]);
                  if(this.y >= var5) {
                     return;
                  }

                  this.y = var5 + var5 - 1 - this.y;
                  this.w = -this.w;
               }
            } else if(this.w < 0) {
               while(true) {
                  var9 = this.a(var1, var9, var5, var3, var4.k[this.B - 1]);
                  if(this.y >= var5) {
                     return;
                  }

                  this.y = var6 - 1 - (var6 - 1 - this.y) % var8;
               }
            } else {
               while(true) {
                  var9 = this.b(var1, var9, var6, var3, var4.k[this.p]);
                  if(this.y < var6) {
                     return;
                  }

                  this.y = var5 + (this.y - var5) % var8;
               }
            }
         } else {
            if(this.x > 0) {
               if(this.r) {
                  label134: {
                     if(this.w < 0) {
                        var9 = this.a(var1, var2, var5, var3, var4.k[this.p]);
                        if(this.y >= var5) {
                           return;
                        }

                        this.y = var5 + var5 - 1 - this.y;
                        this.w = -this.w;
                        if(--this.x == 0) {
                           break label134;
                        }
                     }

                     do {
                        var9 = this.b(var1, var9, var6, var3, var4.k[this.B - 1]);
                        if(this.y < var6) {
                           return;
                        }

                        this.y = var6 + var6 - 1 - this.y;
                        this.w = -this.w;
                        if(--this.x == 0) {
                           break;
                        }

                        var9 = this.a(var1, var9, var5, var3, var4.k[this.p]);
                        if(this.y >= var5) {
                           return;
                        }

                        this.y = var5 + var5 - 1 - this.y;
                        this.w = -this.w;
                     } while(--this.x != 0);
                  }
               } else {
                  int var10;
                  if(this.w < 0) {
                     while(true) {
                        var9 = this.a(var1, var9, var5, var3, var4.k[this.B - 1]);
                        if(this.y >= var5) {
                           return;
                        }

                        var10 = (var6 - 1 - this.y) / var8;
                        if(var10 >= this.x) {
                           this.y += var8 * this.x;
                           this.x = 0;
                           break;
                        }

                        this.y += var8 * var10;
                        this.x -= var10;
                     }
                  } else {
                     while(true) {
                        var9 = this.b(var1, var9, var6, var3, var4.k[this.p]);
                        if(this.y < var6) {
                           return;
                        }

                        var10 = (this.y - var5) / var8;
                        if(var10 >= this.x) {
                           this.y -= var8 * this.x;
                           this.x = 0;
                           break;
                        }

                        this.y -= var8 * var10;
                        this.x -= var10;
                     }
                  }
               }
            }

            if(this.w < 0) {
               this.a(var1, var9, 0, var3, 0);
               if(this.y < 0) {
                  this.y = -1;
                  this.k();
                  this.a((byte)22);
               }
            } else {
               this.b(var1, var9, var7, var3, 0);
               if(this.y >= var7) {
                  this.y = var7;
                  this.k();
                  this.a((byte)119);
               }
            }

         }
      }
   }

   private static final int b(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, on var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if((var5 = var3 + var7 - var2) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
      }

      var8.y = var2 << 8;
      return var3;
   }

   final synchronized void c(int var1) {
      if(var1 == 0) {
         this.b(0);
         this.a((byte)19);
      } else if(this.v == 0 && this.z == 0) {
         this.A = 0;
         this.n = 0;
         this.t = 0;
         this.a((byte)38);
      } else {
         int var2 = -this.t;
         if(this.t > var2) {
            var2 = this.t;
         }

         if(-this.v > var2) {
            var2 = -this.v;
         }

         if(this.v > var2) {
            var2 = this.v;
         }

         if(-this.z > var2) {
            var2 = -this.z;
         }

         if(this.z > var2) {
            var2 = this.z;
         }

         if(var1 > var2) {
            var1 = var2;
         }

         this.A = var1;
         this.n = Integer.MIN_VALUE;
         this.o = -this.t / var1;
         this.s = -this.v / var1;
         this.u = -this.z / var1;
      }
   }

   final synchronized void b(boolean var1) {
      this.w = (this.w ^ this.w >> 31) + (this.w >>> 31);
      if(var1) {
         this.w = -this.w;
      }

   }

   private static final int d(int var0, int var1) {
      return var1 < 0?-var0:(int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
   }

   final boolean h() {
      return this.A != 0;
   }

   private static final int a(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, on var10, int var11, int var12) {
      if(var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         byte var13 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if(var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      var0 = var12;

      for(var1 = var11; var5 < var7; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
      }

      var10.y = var4;
      return var5;
   }

   private static final int b(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, on var10, int var11, int var12) {
      if(var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
         var7 = var8;
      }

      int var10001;
      byte var13;
      while(var5 < var7) {
         var1 = var4 >> 8;
         var13 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if(var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
         var7 = var8;
      }

      for(var1 = var12; var5 < var7; var4 += var11) {
         var13 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
      }

      var10.y = var4;
      return var5;
   }

   private static final int a(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, on var13, int var14, int var15) {
      var13.t -= var13.o * var5;
      if(var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         byte var16 = var2[var1 - 1];
         var0 = (var16 << 8) + (var2[var1] - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if(var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.t += var13.o * var5;
      var13.v = var6;
      var13.z = var7;
      var13.y = var4;
      return var5;
   }

   final synchronized void a(int var1, int var2, int var3) {
      if(var1 == 0) {
         this.b(var2, var3);
      } else {
         int var4 = a(var2, var3);
         int var5 = d(var2, var3);
         if(this.v == var4 && this.z == var5) {
            this.A = 0;
         } else {
            int var6 = var2 - this.t;
            if(this.t - var2 > var6) {
               var6 = this.t - var2;
            }

            if(var4 - this.v > var6) {
               var6 = var4 - this.v;
            }

            if(this.v - var4 > var6) {
               var6 = this.v - var4;
            }

            if(var5 - this.z > var6) {
               var6 = var5 - this.z;
            }

            if(this.z - var5 > var6) {
               var6 = this.z - var5;
            }

            if(var1 > var6) {
               var1 = var6;
            }

            this.A = var1;
            this.n = var2;
            this.q = var3;
            this.o = (var2 - this.t) / var1;
            this.s = (var4 - this.v) / var1;
            this.u = (var5 - this.z) / var1;
         }
      }
   }

   private static final int a(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, on var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.v += var9.s * (var6 - var3);
      var9.z += var9.u * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      var9.t = var4 >> 2;
      var9.y = var2 << 8;
      return var3;
   }

   private on(hb var1, int var2, int var3, int var4) {
      this.k = var1;
      this.p = var1.m;
      this.B = var1.o;
      this.r = var1.n;
      this.w = var2;
      this.n = var3;
      this.q = var4;
      this.y = 0;
      this.i();
   }

   final synchronized void f(int var1) {
      this.b(var1 << 6, this.l());
   }

   final int d() {
      return this.n == 0 && this.A == 0?0:1;
   }

   final synchronized void d(int var1) {
      int var2 = ((hb)this.k).k.length << 8;
      if(var1 < -1) {
         var1 = -1;
      }

      if(var1 > var2) {
         var1 = var2;
      }

      this.y = var1;
   }
}
